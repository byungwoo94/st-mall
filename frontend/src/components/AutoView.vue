<template>

    <v-data-table
        :headers="headers"
        :items="auto"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'AutoView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            auto : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/autos'))

            temp.data._embedded.autos.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.auto = temp.data._embedded.autos;
        },
        methods: {
        }
    }
</script>

